package com.frostwire.jlibtorrent;

import java.util.ArrayList;

/**
 * @author gubatron
 * @author aldenml
 */
public final class PiecesTracker {

    private final int numFiles;
    private final int numPieces;

    private final int[][] files;
    private final long[][] sizes;
    private final boolean[] complete;

    public PiecesTracker(TorrentInfo ti) {
        this.numFiles = ti.getNumFiles();
        this.numPieces = ti.getNumPieces();

        this.files = new int[numFiles][];
        this.sizes = new long[numFiles][];
        this.complete = new boolean[numPieces];

        FileStorage fs = ti.getFiles();

        for (int fileIndex = 0; fileIndex < numFiles; fileIndex++) {
            long size = fs.getFileSize(fileIndex);
            int firstPiece = ti.mapFile(fileIndex, 0, 1).getPiece();
            int lastPiece = ti.mapFile(fileIndex, size - 1, 1).getPiece();

            int numSlices = lastPiece - firstPiece + 1;
            files[fileIndex] = new int[numSlices];
            sizes[fileIndex] = new long[numSlices];

            for (int pieceIndex = firstPiece; pieceIndex <= lastPiece; pieceIndex++) {
                int index = pieceIndex - firstPiece;

                files[fileIndex][index] = pieceIndex;

                ArrayList<FileSlice> slices = ti.mapBlock(pieceIndex, 0, ti.getPieceSize(pieceIndex));
                for (FileSlice slice : slices) {
                    if (slice.getFileIndex() == fileIndex) {
                        sizes[fileIndex][index] = slice.getSize();
                    }
                }
            }
        }
    }

    public int getNumFiles() {
        return numFiles;
    }

    public int getNumPieces() {
        return numPieces;
    }

    public boolean isComplete(int pieceIndex) throws IllegalArgumentException {
        return complete[pieceIndex];
    }

    public void setComplete(int pieceIndex, boolean complete) throws IllegalArgumentException {
        this.complete[pieceIndex] = complete;
    }

    public long getSequentialDownloadedBytes(int fileIndex) {
        int[] pieces = files[fileIndex];

        long downloaded = 0;

        for (int i = 0; i < pieces.length; i++) {
            int pieceIndex = pieces[i];

            if (complete[pieceIndex]) {
                downloaded += sizes[fileIndex][i];
            } else {
                break;
            }
        }

        return downloaded;
    }

    public int getSequentialDownloadedPieces(int fileIndex) {
        int[] pieces = files[fileIndex];

        int count = 0;

        for (int i = 0; i < pieces.length; i++) {
            int pieceIndex = pieces[i];

            if (complete[pieceIndex]) {
                count++;
            } else {
                break;
            }
        }

        return count;
    }
}
