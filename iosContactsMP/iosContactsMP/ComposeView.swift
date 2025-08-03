//
//  ComposeView.swift
//  iosContactsMP
//
//  Created by Bhanukiran on 03/08/25.
//  Copyright © 2025 orgName. All rights reserved.
//
import Foundation
import shared
import SwiftUI

struct ComposeView : UIViewControllerRepresentable {
    func updateUIViewController(_ uiViewController: UIViewControllerType, context: Context) {
        
    }
    
    func makeUIViewController(context: Context) -> some UIViewController {
        MainViewControllerKt.MainViewController()
    }
}
